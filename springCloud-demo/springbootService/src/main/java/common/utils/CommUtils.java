package common.utils;

import javax.servlet.http.HttpServletResponse;
/**
 * @Author: shuangyan.sun
 * @Date: 2021/05/21/15:38
 * @Description:
 */
public class CommUtils {

    // JSON格式化
    public static String printDataJason(HttpServletResponse response,Object item) {
        String jsonStr = null;
        try {

            jsonStr = JsonUtils.renderString(response, item);

        } catch (Exception e) {
            e.printStackTrace();
        }

        return jsonStr;
    }

    /**
     * 随机生成6位随机验证码
     *
     */
    public static String createRandomVcode(int len) {
        // 验证码
        String vcode = "";
        for (int i = 0; i < len; i++) {
            vcode = vcode + (int) (Math.random() * 9);
        }
        return vcode;
    }
}