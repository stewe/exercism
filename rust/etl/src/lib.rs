use std::collections::BTreeMap;

pub fn transform(input: &BTreeMap<i32, Vec<String>>) -> BTreeMap<String, i32> {
    let mut output = BTreeMap::new();
    for (points, letters) in input {
        for l in letters {
            output.insert(l.to_lowercase(), *points);
        }
    }
    output
}
