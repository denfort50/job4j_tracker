package ru.job4j.bank;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Класс описывает работу банковского сервиса.
 */
public class BankService {
    /**
     * Хранение информации о пользователе и его счетах
     * осуществляется в коллекции типа HashMap.
     */
    private Map<User, List<Account>> users = new HashMap<>();

    /**
     * Метод принимает на вход пользователя и добавляет его в карту.
     * Вместе с пользователем в карту добавляется пустой список
     * счетов пользователя типа ArrayList.
     * @param user пользователь, который добавляется в коллекцию
     */
    public void addUser(User user) {
        users.putIfAbsent(user, new ArrayList<Account>());
    }

    /**
     * Метод принимает на вход номер пасспорта, счет
     * и добавляет новый счет в список счетов пользователя.
     * @param passport номер паспорта пользователя
     * @param account счет пользователя
     */
    public void addAccount(String passport, Account account) {
        User user = findByPassport(passport);
        List<Account> userAccounts = users.get(user);
        if (user != null && !userAccounts.contains(account)) {
            userAccounts.add(account);
        }
    }

    /**
     * Метод принимает на вход номер паспорта и по нему
     * осуществляет поиск пользователя.
     * @param passport номер паспорта пользователя
     * @return возвращает пользователя
     */
    public User findByPassport(String passport) {
        return users.keySet()
                .stream()
                .filter(user -> user.getPassport().equals(passport))
                .findFirst()
                .orElse(null);
    }

    /**
     * Метод принимает на вход номер паспорта, реквизиты счета
     * и по ним осуществляет поиск счета.
     * @param passport номер паспорта пользователя
     * @param requisite реквизиты счета
     * @return возвращает номер счета пользователя
     */
    public Account findByRequisite(String passport, String requisite) {
        User user = findByPassport(passport);
        if (user != null) {
            return users.get(user)
                    .stream()
                    .filter(account -> account.getRequisite().equals(requisite))
                    .findFirst()
                    .orElse(null);
        }
        return null;
    }

    /**
     * Метод принимает на вход номер паспорта, реквизиты счета отправителя,
     * номер паспорта, реквизиты счета получателя, сумму перевода
     * и осуществляет перевод денежных средств со счета на счет.
     * @param srcPassport номер паспорта отправителя
     * @param srcRequisite реквизиты счета отправителя
     * @param destPassport номер паспорта получателя
     * @param destRequisite реквизиты получателя
     * @param amount сумма перевода
     * @return возвращает true, если перевод осуществлен успешно
     */
    public boolean transferMoney(String srcPassport, String srcRequisite,
                                 String destPassport, String destRequisite, double amount) {
        boolean rsl = false;
        Account srcAccount = findByRequisite(srcPassport, srcRequisite);
        Account destAccount = findByRequisite(destPassport, destRequisite);
        if (srcAccount != null && destAccount != null && srcAccount.getBalance() >= amount) {
            srcAccount.setBalance(srcAccount.getBalance() - amount);
            destAccount.setBalance(destAccount.getBalance() + amount);
            rsl = true;
        }
        return rsl;
    }
}
