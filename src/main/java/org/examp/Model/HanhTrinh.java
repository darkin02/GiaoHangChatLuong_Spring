package org.examp.Model;

import java.util.Date;

public class HanhTrinh {
    public HanhTrinh(Date time, String tenNK, Boolean suKien)
    {
        Time = time;
        TenNK = tenNK;
        SuKien = suKien;
    }


    public Date getTime() {
        return Time;
    }

    public void setTime(Date time) {
        Time = time;
    }

    public String getTenNK() {
        return TenNK;
    }

    public void setTenNK(String tenNK) {
        TenNK = tenNK;
    }

    public Boolean getSuKien() {
        return SuKien;
    }

    public void setSuKien(Boolean suKien) {
        SuKien = suKien;
    }

    public Date Time;
    public String TenNK;

    public Boolean SuKien ;
}
