package com.visionpragma.khusiharmony.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Tenant
    {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private int id;
        private long mobileNo;
        private String name;
        private String address;

        public int getId() {
            return id;
        }

        public void setId(int tenatid) {
            this.id = id;
        }

        public long getMobileNo() {
            return mobileNo;
        }

        public void setMobilNo(long mobileNo) {
            this.mobileNo = mobileNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getAddress() {
            return address;
        }

        public void setAddress(String address) {
            this.address = address;
        }

        public Tenant() {
        }
    }


