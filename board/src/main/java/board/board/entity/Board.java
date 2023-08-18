package board.board.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.sql.Time;

@Entity
@Data
public class Board {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String jpname;

    private String jplocation;

    private String jpimg;

    private String jpnum;

    private String jpopen;

    private String jpclose;

    private String opentime;

    private String closetime;

    private String jpuse;

    private String jppay;

    private String message;

    private String jpcategory;

    private Integer jpoption;
}
