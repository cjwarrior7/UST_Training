package com.company;

public class ServiceProvider {
public static Atm_services getServices(String request){
   if(request.equals("sbi")) {
        System.out.println("WELCOME TO SBI");
        return new SbiBank();
    }
    else if(request.equals("pnb")){
        System.out.println("WELCOME TO PNB");
        return new PnbBank();
    }
    return null;
}

}
