provider "google" {
  credentials = "${file("google-key.json")}"
  project     = "devops-kevinberg"
  region      = "us-central1"
  zone        = "us-central1-c"
}