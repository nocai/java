package com.liujun.validator;

import com.liujun.entity.Address;
import com.liujun.entity.User;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;
import org.springmodules.validation.valang.ValangValidator;

public class UserValidator extends ValangValidator {
private Validator addressValidator;
 
    public void setAddressValidator(Validator addressValidator) {
        this.addressValidator = addressValidator;
    }
     
    public void validate(Object target, Errors errors){
        super.validate( target, errors);
        Address address= ((User)target).getAddress();
        // address 为 null 时，不进行进一步的验证。
        if( null!= address){
            //注意与 popNestedPath 成对使用
            errors.pushNestedPath("address");
            //验证 address
            addressValidator.validate( address, errors);
            errors.popNestedPath();
        }
    }
}