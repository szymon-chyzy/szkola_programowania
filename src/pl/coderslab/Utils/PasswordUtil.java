package pl.coderslab.Utils;

import org.mindrot.jbcrypt.BCrypt;

public final static class PasswordUtil {

    private PasswordUtil() {}

    public static String createHash(String password) {
        return BCrypt.hashpw(password, BCrypt.gensalt());
    }


}
