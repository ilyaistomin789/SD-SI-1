package com.example.demo.model.billingAccount;

import com.example.demo.annotations.Attribute;
import com.example.demo.annotations.ObjectType;
import com.example.demo.annotations.Reference;
import com.example.demo.model.Base;
import com.example.demo.model.customer.Customer;
import com.example.demo.model.customer.Status;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.math.BigDecimal;

@EqualsAndHashCode(callSuper = true)
@Data
@ObjectType(objectTypeId = "3")
public class BillingAccount extends Base {
    @Reference(attrId = "4")
    private Customer customer;
    @Attribute(attrId = "8")
    private BigDecimal balance;
    @Attribute(attrId = "6")
    private Status status;
}
