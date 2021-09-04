#!/usr/bin/env bash
set -e

rm -rf .clj-kondo/.cache
clj -Sdeps '{:deps {clj-kondo/clj-kondo {:mvn/version "2021.08.07-20210822.045523-16"}}}' -M -e "$(cat clj_kondo_exec.clj)" | clj -Sdeps '{:deps {borkdude/jet {:mvn/version "0.0.12"}}}' -M -m jet.main --query ':findings'
