package com.tosan.example2;

public class example2 {
    public static void main(String[] args) {
        String[] titles = {"", "Deposit2", "Deposit3", "Deposit4","Deposit5"};
        String[] customers = {"Customer1", "Customer2","Customer3","Customer4","Customer5"};
        int[] initBalances = {10, 0, 0 , 20, 100};
//        Deposit[] deposits = openGroupDeposits(titles, customers, initBalances);
//        if(deposits == null){
//            System.out.println("No deposit opened");
//        } else {
//            for (Deposit deposit : deposits) {
//                deposit.printDeposit();
//            }
//        }
        // CustomerResponse = createCustomer(customers);
//        Response response = openGroupDepositsNew(titles, customers, initBalances);
//        if(response.getStatus() == 0){
//            for (Deposit deposit : response.getDeposits()) {
//                deposit.printDeposit();
//            }
//        }
//        if(response.getStatus() == -2){
//            System.out.println("let me check");
//        }
    }
    //  0: success
    // -1: different length
    // -2: empty title
    // -3: empty customer
    // -4: negative init balance
    // -5: ...
//    private static Response openGroupDepositsNew(String[] titles, Customer[] customers, int[] initBalances) {
//        if (titles.length != customers.length || customers.length != initBalances.length || titles.length != initBalances.length){
//            System.out.println("wrong data: different length");
//            return new Response(-1, null);
//        } else {
//            for (String title : titles){
//                if(title.isEmpty()){
//                    System.out.println("wrong data: empty title");
//                    return new Response(-2, null);
//                }
//            }
//            for (String customer : customers){
//                if(customer.isEmpty()){
//                    System.out.println("wrong data: empty customer");
//                    return new Response(-3, null);
//                }
//            }
//            for (int initBalance : initBalances){
//                if(initBalance < 0){
//                    System.out.println("wrong data: negative init balance");
//                    return new Response(-4, null);
//                }
//            }
//            Deposit[] deposits = new Deposit[initBalances.length];
//            for (int i = 0; i < initBalances.length ; i++){
//                deposits[i] = new Deposit(titles[i], customers[i], initBalances[i]);
//            }
//            return new Response(0, deposits);
//        }
//    }
//
//    private static Deposit[] openGroupDeposits(String[] titles, String[] customers, int[] initBalances) {
//        if (titles.length != customers.length || customers.length != initBalances.length || titles.length != initBalances.length){
//            System.out.println("wrong data: different length");
//            return null;
//        } else {
//            for (String title : titles){
//                if(title.isEmpty()){
//                    System.out.println("wrong data: empty title");
//                    return null;
//                }
//            }
//            for (String customer : customers){
//                if(customer.isEmpty()){
//                    System.out.println("wrong data: empty customer");
//                    return null;
//                }
//            }
//            for (int initBalance : initBalances){
//                if(initBalance < 0){
//                    System.out.println("wrong data: negative init balance");
//                    return null;
//                }
//            }
//            Deposit[] deposits = new Deposit[initBalances.length];
//            for (int i = 0; i < initBalances.length ; i++){
//                deposits[i] = new Deposit(titles[i], customers[i], initBalances[i]);
//            }
//            return deposits;
//        }
//    }
}
