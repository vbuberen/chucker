#!/bin/bash

# Copy changelog from root to make it available for Mkdocs
cp CHANGELOG.md docs/changelog.md

# Deploy to Github pages.
mkdocs gh-deploy