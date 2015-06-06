package com.logistic.api.model.post;

/**
 * Created by AnatoliyKapustin on 01.06.2015.
 */
public enum PackageType {
        T_CP("����� �����"), T_30("������", 50), T_10("������� UPS 10 ��", 10),
        T_25("������� UPS 25 ��", 25), T_27("������� ������� UPS Express");

        private final String description;
        private final int maxWeight;

        private PackageType(String description) {
            this(description, 0);
        }

        private PackageType(String description, int maxWeight) {
            this.description = description;
            this.maxWeight = maxWeight;
        }

        public String getDescription() {
            return description;
        }

        public int getMaxWeight() {
            return maxWeight;
        }
    }
