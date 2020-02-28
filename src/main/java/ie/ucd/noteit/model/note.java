package ie.ucd.noteit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Notes")
public class note{
    @Id private int id;
    @Column private String title;
    @Column private String content;
    @Column private String date;
    
    public int getId(){ return id;}
    public void setId(int id){ this.id = id;}
    public String getTitle(){return title;}
    public void setTitle(String title){this.title = title;}
    public String getContent(){return content;}
    public void setContent(String content){this.content = content;}
    public String getDate(){return date;}
    public void setDate(String date){this.date = date;}
}


