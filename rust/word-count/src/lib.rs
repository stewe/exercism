use std::collections::HashMap;

pub fn word_count(s: &str) -> HashMap<String, u32> {
    let mut map = HashMap::new();
    for w in s.split(|c: char| !c.is_alphanumeric()).filter(|x| !x.is_empty()) {
        let count = map.entry(w.to_lowercase()).or_insert(0);
        *count += 1;
    }
    map
}
