object Main {
    
    val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"

    def Enc(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) + key) % a.size)//encription function, take a one charactor and 
                                                                                    //encript according to key an alphabet
    def Dec(c: Char, key: Int, a: String) = a((a.indexOf(c.toUpper) - key) % a.size)//decription function, take a one charactor and 
                                                                                    //decript according to key an alphabet

    def cipher(algo: (Char, Int, String) => Char, s: String, key: Int, a: String) = s.map(algo(_, key, a))// select the encription 
                                                                                                        //or decription functions

    def main(args: Array[String]) = {
        val encword = cipher(Enc, "CAT", 3, alphabet)//example
        println(encword)
        val decword = cipher(Dec, encword, 3, alphabet)//example
        println(decword)
        
    }
}