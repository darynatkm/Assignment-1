package assignment14;

public class CameraPhone extends Phone{
    int imageSize;
    int memorySize;

public CameraPhone(int imageSize, int memorySize){
    this.imageSize=imageSize;
    this.memorySize=memorySize;
}
public int numPictures(){
    return memorySize/(imageSize*1000);
}
}