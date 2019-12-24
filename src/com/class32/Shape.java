package com.class32;

	public interface Shape {
		void calculateArea(double A);
		void calculatePerimeter(double A);
	}
	class Circle implements Shape {
		static final double pi = 3.14;
		@Override
		public void calculateArea(double A) {
			double area = A * A * pi;
			System.out.println(area);
		}
		@Override
		public void calculatePerimeter(double A) {
			double perimeter = 2 * pi * A;
			System.out.println(perimeter);
		}
	}
	class Square implements Shape {
		@Override
		public void calculateArea(double A) {
			double areaOfSquare = A * A;
			System.out.println(areaOfSquare);
		}
		@Override
		public void calculatePerimeter(double A) {
			double perimeterOfSquare = A * 4;
			System.out.println(perimeterOfSquare);
		}
	}
	
