/*
 Sophia Gorman
 SDEV200 - Assignment 11.1
 3/30/2025
 */

public class GeometricObject {
        private String color = "black";
        private boolean filled;
        private java.util.Date dateCreated;
    
        //Default object
        public GeometricObject() {
            dateCreated = new java.util.Date();
        }
    
        //Object created with specific color / filled
        public GeometricObject(String color, boolean filled) {
            dateCreated = new java.util.Date();
            this.color = color;
            this.filled = filled;
        }
    
        //Returns the color 
        public String getColor() {
            return color;
        }
    
        //Sets a new color
        public void setColor(String color) {
            this.color = color;
        }
    
        //Returns filled
        public boolean isFilled() {
            return filled;
        }
    
        //Sets a new filled
        public void setFilled(boolean filled) {
            this.filled = filled;
        }
    
        public java.util.Date getDateCreated() {
            return dateCreated;
        }
    
        //Outputs a string of date created, color, and filled.
        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color + 
                " and filled: " + filled;
        }
    }