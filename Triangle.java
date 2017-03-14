class Triangle {
  public int mSide1;
  public int mSide2;
  public int mSide3;

  public Triangle(int side1, int side2, int side3){
      mSide1 = side1;
      mSide2 = side2;
      mSide3 = side3;
  }

  public String getTriangleType(){
    if(mSide1 == mSide2 && mSide2 == mSide3){
      return "Equilateral";
    } else{
      if(mSide1 == mSide2 || mSide1 == mSide3 || mSide2 == mSide3){
        return "Isosceles";
      } else{
        return "Scalene";
      }
    }
  }

}
