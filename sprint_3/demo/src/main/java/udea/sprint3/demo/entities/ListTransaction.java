package udea.sprint3.demo.entities;

import java.util.ArrayList;

public class ListTransaction {

    private ArrayList<Transaction> listTransaction;

    public ListTransaction() {

        listTransaction= new ArrayList<>();
    }

    public Transaction findTrasaction(int id){

        for(Transaction transaction: listTransaction){
            if(Integer.compare(transaction.getId(),id)==0){//da cero si son iguales
                return transaction;
            }
        }
        return null;
    }

    public boolean addTransaction(Transaction transaction){

        if(findTrasaction(transaction.getId())==null){

            listTransaction.add(transaction);
            return true;
        }
        return false;
    }

    public Transaction updateTransaction(Transaction transaction){

        Transaction transactionaux= findTrasaction(transaction.getId());

        if(transactionaux!=null){

            listTransaction.set(listTransaction.indexOf(transactionaux),transaction);

            return listTransaction.get(listTransaction.indexOf(transaction));
        }
        return null;
    }

    public Transaction deleteTransaction(Transaction transaction){

        if(listTransaction.contains(transaction)){

            listTransaction.remove(transaction);
            return transaction;
        }

        return null;
    }

    public ArrayList<Transaction> getListTransaction() {
        return (ArrayList<Transaction>) listTransaction.clone();
    }
}
