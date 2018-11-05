package cn.bj.common;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.databind.JavaType;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;



/**
 * <p>Title:json表单提交 </p>
 * <p>Description: </p>
 * <p>Company: </p> 
 * @author 林中狼
 * @date 2018年3月19日 下午6:16:00
 */
public class JsonUtils {

    /**
     * 
     */
    private static final ObjectMapper MAPPER = new ObjectMapper();

    /**
     * 将对象转换成json字符串。
     * <p>Title: pojoToJson</p>
     * <p>Description: </p>
     * @param data
     * @return
     */
    public static void objectToJson(HttpServletResponse response,  String code,  String msg,  Object object) {
    	 response.setContentType("application/json;charset=UTF-8");
         final String resultCode=code;
         final String resultMsg =msg;
         final Object resultObject=object;
         try {
             MAPPER.setSerializationInclusion(JsonInclude.Include.NON_NULL);
             MAPPER.writeValue(response.getWriter(), new HashMap<String, Object>() {
                 /**
				 * 
				 */
				private static final long serialVersionUID = 1L;

				{
                     put("code", resultCode);
                     put("msg", resultMsg);
                     put("date", resultObject);
                 }
             });
         } catch (JsonGenerationException | JsonMappingException e) {
             e.printStackTrace();
         } catch (IOException e) {
             e.printStackTrace();
         }
         
     }
    
    
    
    
    
    
    
    /**
     * 将json数据转换成pojo对象list
     * <p>Title: jsonToList</p>
     * <p>Description: </p>
     * @param jsonData
     * @param beanType
     * @return
     */
    public static <T>List<T> jsonToList(String jsonData, Class<T> beanType) {
    	JavaType javaType = MAPPER.getTypeFactory().constructParametricType(List.class, beanType);
    	try {
    		List<T> list = MAPPER.readValue(jsonData, javaType);
    		return list;
		} catch (Exception e) {
			e.printStackTrace();
		}
    	
    	return null;
    }
    
    
    
    
    
    
    
   
}
