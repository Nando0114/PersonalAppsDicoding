package com.fernando.dicodingsubmission;

import android.os.Parcel;
import android.os.Parcelable;

public class Satellite implements Parcelable {
    private String nama_satellite;
    private String detail_satellite;
    private int picture_satellite;

    public Satellite() {

    }

    Satellite(Parcel in) {
        nama_satellite = in.readString();
        detail_satellite = in.readString();
        picture_satellite = in.readInt();
    }

    public static final Creator<Satellite> CREATOR = new Creator<Satellite>() {
        @Override
        public Satellite createFromParcel(Parcel in) {
            return new Satellite(in);
        }

        @Override
        public Satellite[] newArray(int size) {
            return new Satellite[size];
        }
    };


    public String getNama_satellite() {
        return nama_satellite;
    }

    public void setNama_satellite(String nama_satellite) {
        this.nama_satellite = nama_satellite;
    }

    public String getDetail_satellite() {
        return detail_satellite;
    }

    public void setDetail_satellite(String detail_satellite) {
        this.detail_satellite = detail_satellite;
    }

    public int getPicture_satellite() {
        return picture_satellite;
    }

    public void setPicture_satellite(int picture_satellite) {
        this.picture_satellite = picture_satellite;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(nama_satellite);
        dest.writeString(detail_satellite);
        dest.writeInt(picture_satellite);
    }
}
