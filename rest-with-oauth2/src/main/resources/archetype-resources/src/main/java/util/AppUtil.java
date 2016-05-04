package ${package}.util;

import ${package}.common.security.TadalinUserDetail;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.MessageSource;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Locale;


@Component
public class AppUtil {
    private static MessageSource messageSource;

    @Autowired
    public AppUtil(MessageSource messageSource) {
        AppUtil.messageSource = messageSource;
    }

    /**
     * 读取message信息
     * @param messageKey
     * @param args
     * @return
     */
    public static String getMessage(String messageKey, Object... args) {
        return messageSource.getMessage(messageKey, args, Locale.ROOT);
    }

    /**
     * 获取当前登录用户
     * @return
     */
    public static TadalinUserDetail getAuth() {
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        if(null != auth) {
            Object principal = auth.getPrincipal();
            if(principal instanceof TadalinUserDetail) {
                return (TadalinUserDetail) principal;
            }
        }
        return null;
    }
}
