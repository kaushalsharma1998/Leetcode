class 	Leetcodejune20 {
    public String getPermutation(int n, int k) {
    int[] factorials = new int[n];
    List<Integer> list = new ArrayList();
    list.add(1);

    factorials[0] = 1;
    for(int i = 1; i < n; ++i){
      // generate factorials  0!, 1!, ..., (n - 1)!
      factorials[i] = factorials[i - 1] * i;
      // generate nums 1, 2, ..., n
      list.add(i + 1);
    }

    // Decrementing k
    k--;

    // compute factorial representation of k
    StringBuilder sb = new StringBuilder();
    for (int i = n - 1; i >= 0; i--){
      int j = k / factorials[i];
      k -= j * factorials[i];

      sb.append(list.get(j));
      list.remove(j);
    }
    return sb.toString();
  }
	}