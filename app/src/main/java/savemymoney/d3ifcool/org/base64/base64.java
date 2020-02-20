package savemymoney.d3ifcool.org.base64;

import android.util.Base64;

public class base64 {
    public static byte[] decryptBASE64(String key) throws Exception{
        return Base64.decode(key, Base64.DEFAULT);
    }
    public static String encryptBASE64(byte[] key) throws Exception {
        return Base64.encodeToString(key, Base64.DEFAULT);
    }
}
