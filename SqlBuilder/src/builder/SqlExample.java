/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;


/**
 *
 * @author ASUS
 */
public class SqlExample {

    public static void main(String[] args) {
        //  "select placa, marca from vehiculos where marca=mazda  and placa =12 "
    	
        SqlBuilder sqlBuilder = new SqlBuilder();
        Sql sql = sqlBuilder
        		 .select("placa")
                 .andSelect("marca")
                 .from("vehiculos")
                 .where("marca","mazda")
                 .and("color", "verde")
                 .build();
        System.out.println(sql);
    }
    
    
}
