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
public class SqlBuilder implements Builder {

    private String select="";
    private String from="";
    private String where="";
    private String and="";

    public SqlBuilder select(String column) {
        this.select = "select "+column;
        return this;
    }
    
    public SqlBuilder andSelect(String column) {
        this.select += ", "+column+" ";
        return this;
    }

    public SqlBuilder from(String table) {
        this.from = " from "+table+" ";
        return this;
    }

    public SqlBuilder where(String nombreColumna, String valor) {
        this.where = " where "+ nombreColumna+ "=" +valor;
        return this;
    }
    
    public SqlBuilder and(String nombreColumna, String valor) {
        this.and += " and "+ nombreColumna+ "=" +valor;
        return this;
    }
    
   
    

    @Override
    public Sql build() {
        Sql mySql = new Sql();
        mySql.setSelect(this.select);
        mySql.setFrom(this.from);
        mySql.setWhere(this.where);
        mySql.setAnd(this.and);
        
        
      //  "select ........."
        
        return mySql;

    }
}
