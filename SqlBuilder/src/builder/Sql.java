/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

public class Sql {

    private String select;
    private String from;
    private String where;
    private String and;
    

    public Sql() {
      
    }

    public String getSelect() {
        return select;
    }

    public void setSelect(String select) {
        this.select = select;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getWhere() {
        return where;
    }

    public void setWhere(String where) {
        this.where = where;
    }

    public String getAnd() {
        return and;
    }

    public void setAnd(String and) {
        this.and = and;
    }
    
    

   
    @Override
    public String toString() {
        return select + from + where  + and;
    }

}
