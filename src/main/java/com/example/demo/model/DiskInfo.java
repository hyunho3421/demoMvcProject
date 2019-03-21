package com.example.demo.model;

import lombok.Data;

@Data
public class DiskInfo {
    private String free;
    private String total;
    private String usable;

    public DiskInfo() {
    }

    public DiskInfo(double free, double total) {
        this.free = String.format("%.2f", free);
        this.total = String.format("%.2f", total);
        this.usable = String.format("%.2f", total - free);
    }
}
