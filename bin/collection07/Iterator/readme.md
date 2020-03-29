# ����List

## for loop

	for(int i = 0; i < list.size(); i++){
		String temp = (String) list.get(i);
		System.out.println(temp);
	}

## advanced for loop

	for(String temp : list){	
		System.out.println(temp);
	}

## Iterator

	for(Iterator iter = list.iterator(); iter.hasNext()){	
    	String temp = (String) iter.next();
		System.out.println(temp);
	}

## Interator 2

	Iterator iter = list.iterator();
	while(iter.hasNext()){
		Object obj = iter.next();
		iter.remove();  //�����Ҫɾ�����ݵĻ�
		System.out.println(obj);
	}

# ����Set

## for loop

	for(String temp : set){	
		System.out.println(temp);
	}

## Iterator

	for(Iterator iter = set.iterator(); iter.hasNext()){	
    	String temp = (String) iter.next();
		System.out.println(temp);
	}

# ����Map

## for loop

	Map<Integer, Employee> maps = new HashMap<>();
	Set<Integer> keySet = maps.keySet();
	for (Integer id : keySet) {
		System.out.println(maps.get(id).getName());
	}

## EntrySet

	Set<Entry<Integer, Employee>> set = maps.entrySet();
	for (Iterator iter = set.iterator(); iter.hasNext()) {
		Entry e = (Entry)iter.next() 
		System.out.println(e.getKey + " " + e.getValue());
	}



