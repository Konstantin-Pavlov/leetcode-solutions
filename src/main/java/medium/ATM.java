package medium;

import java.util.HashMap;
import java.util.Map;

/**
 * Банкомат. Инициализируется набором купюр и умеет выдавать купюры для заданной суммы, либо отвечать отказом. При
 * выдаче купюры списываются с баланса банкомата. Допустимые номиналы: 50₽, 100₽, 500₽, 1000₽, 5000₽.
 */

public class ATM {
    private final Map<Integer, Integer> banknotes;

    public ATM(Map<Integer, Integer> banknotes) {
        this.banknotes = banknotes;
    }

    public Map<Integer, Integer> withdraw(int amount) {
        if (amount % 50 != 0) {
            throw new IllegalArgumentException("сумма должна быть кратна 50");
        }
        if (!isEnoughMoney(banknotes, amount)) {
            throw new IllegalArgumentException("в банкомате не хватает средств");
        }

        int[] nominals = new int[]{5000, 1000, 500, 100, 50};
        Map<Integer, Integer> result = new HashMap<>();
        Map<Integer, Integer> banknotesCopy = new HashMap<>(banknotes);
        for (int nominal : nominals) {
            while (banknotesCopy.get(nominal) != 0 || amount < banknotesCopy.get(nominal)) {
                if (amount < nominal) {
                    break;
                }
                result.put(nominal, result.getOrDefault(nominal, 0) + 1);
//                banknotesCopy.computeIfPresent(nominal, (k, v) -> v - 1);
                banknotesCopy.put(nominal, banknotesCopy.get(nominal) - 1);
                amount -= nominal;
            }
        }
        if (amount != 0) {
            throw new IllegalArgumentException("в банкомате не хватает необходимых купюр");
        }
        banknotes.putAll(banknotesCopy);
        return result;
    }

    private boolean isEnoughMoney(Map<Integer, Integer> banknotes, int amount) {
        return banknotes.entrySet().stream()
                .mapToInt(entry -> entry.getKey() * entry.getValue())
                .sum() >= amount;
    }


    public static void main(String[] args) {
        Map<Integer, Integer> banknotes = new HashMap<>(Map.of(
                5000, 2,
                1000, 4,
                500, 3,
                100, 2,
                50, 1
        ));
        ATM atm = new ATM(banknotes);
        System.out.println(banknotes);
        System.out.println(atm.withdraw(1150));
        System.out.println(banknotes);
    }

}
