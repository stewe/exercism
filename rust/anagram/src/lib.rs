pub fn anagrams_for<'a>(word: &'a str, list: &'a [&'a str]) -> Vec<&'a str> {
    // let mut res: Vec<&str> = vec![];
    // let mut bytes = word.to_lowercase().into_bytes();
    // bytes.sort();
    // for ele in list {
    //     let mut elem = ele.to_lowercase().into_bytes();
    //     elem.sort();
    //     if elem == bytes && ele.to_lowercase() != word.to_lowercase() {
    //         res.push(ele);
    //     }
    // }
    // res
    let mut res: Vec<&str> = vec![];
    let mut bytes = word.to_lowercase().chars().collect::<Vec<char>>();
    bytes.sort();
    for ele in list {
        let mut elem = ele.to_lowercase().chars().collect::<Vec<char>>();
        elem.sort();
        if elem == bytes && ele.to_lowercase() != word.to_lowercase() {
            res.push(ele);
        }
    }
    res
}
