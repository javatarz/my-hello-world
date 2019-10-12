class HelloWorld{
	public static void main(String args[]){
        String message = "hello world !";
        StringBuffer finalMessage = new StringBuffer("");
        for(int i = 0; i < message.length(); i++){
            Character c = message.charAt(i);
            if(i%2 == 0)
                finalMessage.append(Character.toUpperCase(c));
            else
                finalMessage.append(Character.toLowerCase(c));
        }
        System.out.println(finalMessage);
    }
}