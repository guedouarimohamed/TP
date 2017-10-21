package tp;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class VectorHelperTest {

	@Test 
	public void test_get_Vector()
	{
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,3,4,5};
		V.init_Vector(tab,5);
		int Vec[]=V.get_Vector();
		for(int i=0;i<5;i++){
			assertEquals(Vec[i],i+1);
	      }
	}
	
	@Test 
	public void test_get_n()
	{
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,3,4,5};
		V.init_Vector(tab,5);
		int nb=V.get_n();
			assertEquals(5,nb);
	}
	
	@Test
	public void test_get_is_initialiser(){
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,3,4,5};
		V.init_Vector(tab, 5);
		assertEquals(true,V.get_is_initialiser());
	}
	
	@Test
	public void test_get_max_min(){
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,8,0,3};
		V.init_Vector(tab,5);
		V.max_min();
		assertEquals(8,V.get_max());
		assertEquals(0,V.get_min());
	}
	
	
	
	@Test
	public void test_init() {
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,3,4,5};
		V.init_Vector(tab,5);
      for(int i=0;i<5;i++){
		assertEquals(V.get_Vector()[i],i+1);
      }
	}
	
	@Test
	public void test_tri() {
		VectorHelper V=new VectorHelper();
		int tab[]={5,4,3,2,1};
		V.init_Vector(tab,5);
		V.tri_selection();
      for(int i=0;i<5;i++){
		assertEquals(V.get_Vector()[i],i+1);
      }
	}
	@Test
	public void test_invers(){
		VectorHelper V=new VectorHelper();
		int tab[]={1,2,3,4,5};
		V.init_Vector(tab,5);
		V.invers_Vector();
		for(int i=0;i<5;i++){
			assertEquals(V.get_Vector()[i],5-i);
	      }
	}
	
	
	@Test
	public void test_add(){
		
	     System.out.println("drfvgtrvrgtvrtvrrfr");
		VectorHelper V=new VectorHelper();
		 VectorHelper V2=new VectorHelper();
			int tab[]={5,4,3,2,1};
			int tab2[]={1,2,3,4,5};
			V.init_Vector(tab,5);
			V2.init_Vector(tab2,5);
	      try{
	       V.add(V2);
	      }catch(Exception e){ System.out.println(e.getMessage());  }
	      for(int i=0;i<5;i++){
	  		assertEquals(V.get_Vector()[i],6);
	        }
	}
	
	@Test
	public void test_max_min(){
		
		VectorHelper V=new VectorHelper();
		int tab[]={3,1,6,5,1};
		V.init_Vector(tab,5);
		V.max_min();
		assertEquals(V.get_max(),6);
		assertEquals(V.get_min(),1);
	}
	@Test
	public void  test_fonc()
	{
		VectorHelper V=new VectorHelper();
		int tab[]={3,1,6,5,1};
		V.init_Vector(tab,5);
		V.fonc(2, 1);
		
		assertEquals(V.get_Vector()[0],7);
		assertEquals(V.get_Vector()[1],3);
		assertEquals(V.get_Vector()[2],13);
		assertEquals(V.get_Vector()[3],11);
		assertEquals(V.get_Vector()[4],3);
		
	}
}
