package models.employees;

import models.employees.info.Address;
import models.employees.info.Syndicate;
import models.employees.info.payment.Payment;
import models.payday.WeeklyPayday;

public class Hourly extends Employee {

    private Payment payment_schedule;

    public Hourly(int id, String name, Address address, Syndicate syndicate){
        super(id, name, address, syndicate);
        this.payment_schedule = new Payment(new WeeklyPayday(1,5), 0);
    }

    public Hourly(int id, String name, Address address, Syndicate syndicate, Payment payment_schedule){
        super(id, name, address, syndicate);
        this.payment_schedule = payment_schedule;
    }

    public Payment getPayment_schedule() {
        return payment_schedule;
    }
}
