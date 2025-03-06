#!/bin/bash

# Stop the script if any command fails
set -e

# Pull the latest version of the code from GitHub
echo "Pulling the latest code from GitHub..."
git pull origin main

# Build the Docker image
echo "Building the Docker image..."
docker build -t your-image-name .

# Stop and remove the existing container
echo "Stopping and removing the existing container..."
docker stop your-container-name || true
docker rm your-container-name || true

# Run the new Docker container
echo "Starting the new Docker container..."
docker run -d -p 80:80 --name your-container-name your-image-name

# Clean up old Docker images
echo "Cleaning up old Docker images..."
docker image prune -f

echo "Deployment successful!"
