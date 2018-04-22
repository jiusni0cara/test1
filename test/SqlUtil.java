public class SqlUtil {  
      
    /** 
     * 导入sql 
     */  
    String importSql = "select count(*) from oa_notify_record r right JOIN oa_notify n on r.notify_id = n.id where r.user_id =? and r.is_read = ? ";
      
    /** 
     * 参数 
     */  
    String parameterStr = "1(Long), 0(String)";

      
    /** 
     * sql输出 
     * @return 
     */  
    public String sqlOut () {  
        String exportSql = importSql.trim(); //导出sql  
        String [] parameters = parameterStr.split(",");  
        for (String parameter : parameters) {  
            if (parameter.contains("String")) {  
                exportSql = exportSql.replaceFirst("\\?", "'"+parameter.replace("(String)", "").trim()+"'");  
            } else if (parameter.contains("Date")) {  
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Date)", "").trim());  
            } else if (parameter.contains("Long")) {  
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Long)", "").trim());  
            } else if (parameter.contains("Integer")) {  
                exportSql = exportSql.replaceFirst("\\?", parameter.replace("(Integer)", "").trim());  
            } else if (parameter.contains("Timestamp")) {  
                exportSql = exportSql.replaceFirst("\\?", "to_date('"+parameter.replace("(Timestamp)", "").substring(0, 11).trim()+"','yyyy-MM-dd')");  
            }  
        }  
        return exportSql;  
    }  
      
    public static void main(String[] args) {  
        SqlUtil sqlUtil = new SqlUtil();  
        System.out.println(sqlUtil.sqlOut());  
    }  
      
} 