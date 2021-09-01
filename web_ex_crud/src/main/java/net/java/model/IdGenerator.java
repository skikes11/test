package net.java.model;

import java.util.concurrent.atomic.AtomicInteger;

public class IdGenerator
{
private AtomicInteger lastId;
public IdGenerator()
{
this.lastId = new AtomicInteger();
}
public void init( int lastId)
{

this.lastId.set(lastId);
}
public int generate()
{
return this.lastId.incrementAndGet();
}
}