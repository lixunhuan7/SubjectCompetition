package cn.edu.stbu.jw.subjectmatch.Entity;

import lombok.Data;

import java.sql.Date;

@Data
public class MatchNews {
    private Long id;
    private String title;
    private String content;
    private String imageUrl;
    private Date replaceDate;
    private Date replaceUnit;
    private Date promulgator;
    private Long browingCount;
    private String remark;
}
