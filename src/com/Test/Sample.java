package com.Test;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

public class Sample {
    int height;
	int breadth;
	int width;

	public Sample(SampleBuilder builder){
		this.height = builder.height;
		this.width = builder.width;
		this.breadth = builder.breadth;
	}
	
	public static class SampleBuilder{

		int height;
		int breadth;
		int width;

			SampleBuilder(int height){
			this.height = height;
			}

			SampleBuilder setSampleBuilderWidth(int width){
				this.width = width;
				return this;
			}

			SampleBuilder setSampleBuilderBreadth(int breadth){
				this.breadth = breadth;
				return this;
			}

			Sample build(){
				return new Sample(this);
			}
	}



}

class Builder{
	public static void main(String[] args) {
		Sample s = new Sample.SampleBuilder(10).setSampleBuilderWidth(20).setSampleBuilderBreadth(50).build();
		System.out.println(s.height);
		System.out.println(s.width);
		System.out.println(s.breadth);
	}

}