# AboutArchitecture
 **为了学习Java项目架构内容，故开始创建了关于架构的项目**
---

+ **[datastruts:数据结构](/DataStructure/README.md)**
  + 队列
  + Java Set 集合详解
  + Java List 集合
  + Java Map
```
     四种常用Map插入与读取性能比较 
     
```
* 插入10次平均(ms)

||1W|10W|100W|
|:---|---|---|---|
|HashMap|	56|	261|	3030|
|LinkedHashMap|	25|	229|	3069|
|TreeMap|	29	|295	|4117|
|Hashtable|	24|	234|	3275|

* 读取10次平均(ms)

||	1W|	10W|	100W|
|:---|---|---|---|
|HashMap	|2	|21	|220|
|LinkedHashMap	|2	|20	|216|
|TreeMap	|5	|103	|1446|
|Hashtable	|2	|22	|259|



    


