pub fn reply(req: &str) -> &str {
    if req.is_empty() {
        "Fine. Be that way!"
    } else if req.ends_with('?') {
        "Sure."
    } else if !req.chars().any(|c| c.is_lowercase()) {
        "Whoa, chill out!"
    } else {
        "Whatever."
    }
}
