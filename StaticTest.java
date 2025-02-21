class StaticTest{
    
    void m1(){
        StaticTest.m2();  
        m4();             
       this.m3(); 
    }
    
    static void m2(){ }  
    
    void m3(){
        m1();            
        m2();         
        this.m1(); 
    }
    
    static void m4(){ }
}
