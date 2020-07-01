class 	Leetcodejune27 {
    Map<Integer, Integer> map = new HashMap();

    public int numSquares(int n) {
        if (n < 4)
            return n;
        if (map.containsKey(n))
            return map.get(n);
        int count = n;
        for (int i = 1; i * i <= n; i++) {
            count = Math.min(count, numSquares(n - i * i) + 1);
        }
        map.put(n, count);
        return map.get(n);
    }
}