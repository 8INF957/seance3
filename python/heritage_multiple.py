class Classe1:
  def foo(self):
    print("La Classe 1") 
       
class Classe2(Classe1):
  def foo(self):
    print("La Classe 2")

class Classe3(Classe1):
  def foo(self):
    print("La Classe 3")  
        
class Classe4(Classe2, Classe3):
  pass  
     
obj = Classe4()
obj.foo()