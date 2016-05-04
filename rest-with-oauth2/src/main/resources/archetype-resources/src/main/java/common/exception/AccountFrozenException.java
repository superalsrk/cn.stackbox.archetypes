package ${package}.common.exception;

import ${package}.util.AppUtil;
import org.springframework.security.core.userdetails.UsernameNotFoundException;


public class AccountFrozenException extends UsernameNotFoundException {

    public AccountFrozenException() {
        super(AppUtil.getMessage("accountFrozenException"));
    }

    public AccountFrozenException(String msg) {
        super(msg);
    }
}
