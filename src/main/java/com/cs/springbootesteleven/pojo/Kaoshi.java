package com.cs.springbootesteleven.pojo;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Kaoshi {

  @Override
  public String toString() {
    return "Kaoshi{" +
            "ksid=" + ksid +
            ", ksname='" + ksname + '\'' +
            ", kspwd='" + kspwd + '\'' +
            ", ksrq=" + ksrq +
            ", ksxb=" + ksxb +
            '}';
  }

  @Id
  @GeneratedValue
  private Integer ksid;
  private String ksname;
  private String kspwd;
  private java.time.LocalDate ksrq;
  private Integer ksxb;


  public Integer getKsid() {
    return ksid;
  }

  public void setKsid(Integer ksid) {
    this.ksid = ksid;
  }


  public String getKsname() {
    return ksname;
  }

  public void setKsname(String ksname) {
    this.ksname = ksname;
  }


  public String getKspwd() {
    return kspwd;
  }

  public void setKspwd(String kspwd) {
    this.kspwd = kspwd;
  }


  public java.time.LocalDate getKsrq() {
    return ksrq;
  }

  public void setKsrq(java.time.LocalDate ksrq) {
    this.ksrq = ksrq;
  }


  public Integer getKsxb() {
    return ksxb;
  }

  public void setKsxb(Integer ksxb) {
    this.ksxb = ksxb;
  }

}
