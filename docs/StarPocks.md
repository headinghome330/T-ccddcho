StarPocks user code
===================


example code
------------


```Java
java us.dontcareabout.starpocks.Mermaid Stack ArrayList output.md
```

指令格式
--------


#### common code statement ####

```Java
--self （-s） => 顯示 class 本身

--common （-c） => 多個 （2個以上） 共有，若無則 return none

~top （~t ／ ~t * k） => parent 層，如果上層無 parent 則 return none

~bottom （~b ／ ~b * k） => child 層，如果下層無 child 則 return none

--visibility （-v） => 標示存取範圍

--type => field ／ method type，如果 return type 為 void 或是 constructor 則為 --none

--arg:type （-a:type） => parameter type ，如果無參數則為 --arg:none （-a:none）

--static （-$） => 標示 static field ／ method

--method （-m） => 產生 class 的 method

--field （-f） => 產生 class 的 field

--interface （-i） => 產生 class 的 interface

--abstract （-ab） => 產生 abstract method ／ class

--constructor （-ctor） => 產生 class 的 constructor
```

#### hierarchy ／ relation ####

+ 產生給訂的 class 定義的部份，顯示該 class 所有的 hierarchy ／ relation  
=> `java us.dontcareabout.starpocks.Mermaid  classA classB ... output.md`

+ 產生給訂的 class 定義的部份，不用顯示該 class 的 hierarchy ／ relation  
=> `java us.dontcareabout.starpocks.Mermaid --self （-s） classA classB ... output.md`

+ 產生給訂的 class 定義的部份，只顯示該 class 共同的 hierarchy ／ relation  
=> `java us.dontcareabout.starpocks.Mermaid --common （-cm） classA classB ... output.md`

+ 產生給訂的 class 定義的部份，只顯示該 class 的 interface  
=> `java us.dontcareabout.starpocks.Mermaid --interface （-i） classA classB ... output.md`

+ 產生給訂的 class 定義的部份，只顯示該 abstract class  
=> `java us.dontcareabout.starpocks.Mermaid --abstract （-ab） classA classB ... output.md`

+ 產生給訂的 class 定義的部份，只顯示該 class 的 本身與上一層 parent  （每多一層增加一個 ~t 或是 ~t*k）  
=> `java us.dontcareabout.starpocks.Mermaid \~top （~t） classA classB ... output.md`

+ 產生給訂的 class 定義的部份，只顯示該 class 的 本身與下一層 child  （每多一層增加一個 ~b 或是 ~b*k）  
=> `java us.dontcareabout.starpocks.Mermaid \~bottom （~b） classA classB ... output.md`


#### inside class ####

+ 產生所有 visibility 的 method ／ field    
=> `java us.dontcareabout.starpocks.Mermaid -v -m -f classA classB ... output.md`

+ 產生所有 visibility 的 method    
=> `java us.dontcareabout.starpocks.Mermaid -v -m classA classB ... output.md`

+ 產生所有 visibility 的 field     
=> `java us.dontcareabout.starpocks.Mermaid -v -f classA classB ... output.md`

+ 產生給訂的 class 定義的部份 ，顯示給定 visibility 或 給定 type 或 給定 static （$） 的 field      
=> `java us.dontcareabout.starpocks.Mermaid -v ／ --type ／ --static （-$）  （-f） classA classB ... output.md`

+ 產生給訂的 class 定義的部份 ，顯示給定 abstract 或 visibility 或 給定 type 或 給定 static （$） 的 method      
=> `java us.dontcareabout.starpocks.Mermaid --ab ／ -v ／ -t ／ -$  （-m） classA classB ... output.md`

+ 產生給訂的 class 定義的部份 ，顯示給定 visibility 或 給定 args\*type 的 parameters     
=> `java us.dontcareabout.starpocks.Mermaid -v ／ --arg:type （-a:type） classA classB ... output.md`

+ 產生給訂的 class 定義的部份 ，顯示給定 visibility 或 給定 args\*type 的 constructor     
=> `java us.dontcareabout.starpocks.Mermaid -v ／ -a:type --constructor （-ctor） classA classB ... output.md`

+ 產生給訂的 class 定義的部份 ，顯示給定 visibility 或 給定 type 的 return type     
=> `java us.dontcareabout.starpocks.Mermaid -v ／ -t ／ -$ classA classB ... output.md`

