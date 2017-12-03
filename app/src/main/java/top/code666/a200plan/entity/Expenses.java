package top.code666.a200plan.entity;

import android.os.Parcel;
import android.os.Parcelable;

import java.math.BigDecimal;

/**
 * Created by code666 on 2017/11/20.
 */

//支出实体类
public class Expenses implements Parcelable {
    private int id,cate;
    private String notes,times;
    private BigDecimal money;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCate() {
        return cate;
    }

    public void setCate(int cate) {
        this.cate = cate;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public String getTimes() {
        return times;
    }

    public void setTimes(String times) {
        this.times = times;
    }

    public BigDecimal getMoney() {
        return money;
    }

    public void setMoney(BigDecimal money) {
        this.money = money;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(this.id);
        dest.writeInt(this.cate);
        dest.writeString(this.notes);
        dest.writeString(this.times);
        dest.writeSerializable(this.money);
    }

    public Expenses() {
    }

    protected Expenses(Parcel in) {
        this.id = in.readInt();
        this.cate = in.readInt();
        this.notes = in.readString();
        this.times = in.readString();
        this.money = (BigDecimal) in.readSerializable();
    }

    public static final Creator<Expenses> CREATOR = new Creator<Expenses>() {
        @Override
        public Expenses createFromParcel(Parcel source) {
            return new Expenses(source);
        }

        @Override
        public Expenses[] newArray(int size) {
            return new Expenses[size];
        }
    };

    @Override
    public String toString() {
        return "ExpensesActivity{" +
                "id=" + id +
                ", cate=" + cate +
                ", notes='" + notes + '\'' +
                ", times='" + times + '\'' +
                ", money=" + money +
                '}';
    }
}
