package solid.srps.good_approach.validation;

import solid.srps.good_approach.entity.User;
import org.apache.commons.lang3.StringUtils;

import java.util.Objects;

public class UserValidation {
    public boolean isValidUser(User user){
        // null checks
        if(Objects.isNull(user)) return false;
        if(StringUtils.isBlank(user.getEmail())) return false;
        if(StringUtils.isBlank(user.getName())) return  false;
        if(Objects.isNull(user.getUserId())) return false;
        return true;
    }
}
