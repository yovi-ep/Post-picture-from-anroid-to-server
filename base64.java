public static String encodeTobase64(final Bitmap image){
  System.gc();
  if(image == null) return "";

  ByteArrayOutputStream baos = new ByteArrayOutputStream();
  image.compress(Bitmap.CompressFormat.PNG, 60, baos);
  String imageEncoded = Base64.encodeToString(baos.toByteArray(), Base64.DEFAULT);
  return imageEncoded.toString();
  //return "image=data:image/png;base64,"+imageEncoded;
}

public static Bitmap decodeBase64(String input)
{
  byte[] decodedByte = Base64.decode(input, Base64.DEFAULT);
  return BitmapFactory.decodeByteArray(decodedByte, 0, decodedByte.length);
}
